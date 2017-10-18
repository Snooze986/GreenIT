//
//  ViewController.swift
//  GreenIT
//
//  Created by Sonasi KATOA on 09/10/2017.
//  Copyright © 2017 Sonasi Katoa. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    public var content = [["img": "http://fr.web.img3.acsta.net/c_215_290/pictures/17/07/10/17/13/380931.jpg", "title": "EPOUSE-MOI MON POTE"],
                          ["img": "http://fr.web.img5.acsta.net/c_215_290/pictures/17/06/23/09/20/377670.jpg", "title": "ÔTEZ-MOI D'UN DOUTE"],
                          ["img": "http://fr.web.img2.acsta.net/c_215_290/pictures/17/05/31/11/13/023056.jpg", "title": "CONFIDENT ROYAL"],
                          ["img": "http://fr.web.img3.acsta.net/c_215_290/pictures/17/07/26/10/49/580251.jpg", "title": "CAPITAINE SUPERSLIP"],
                          ["img": "http://fr.web.img2.acsta.net/c_215_290/pictures/17/03/29/14/40/513263.jpg", "title": "ÇA"],
                          ["img": "http://fr.web.img4.acsta.net/c_215_290/pictures/17/06/02/10/02/162904.jpg", "title": "SEVEN SISTERS"],
                          ["img": "http://fr.web.img6.acsta.net/c_215_290/pictures/17/07/12/11/50/570288.jpg", "title": "LE SENS DE LA FÊTE"],
                          ["img": "http://fr.web.img5.acsta.net/c_215_290/pictures/17/07/12/10/33/047891.jpg", "title": "LE PETIT SPIROU"],
                          ["img": "http://fr.web.img5.acsta.net/c_215_290/pictures/17/08/24/15/18/597734.jpg", "title": "BLADE RUNNER 2049"],
                          ["img": "http://fr.web.img4.acsta.net/c_215_290/pictures/17/07/05/12/44/185176.jpg", "title": "BARBARA"],
                          ["img": "http://fr.web.img3.acsta.net/c_215_290/pictures/17/06/12/09/36/489167.jpg", "title": "MON GARÇON"],
                          ["img": "http://fr.web.img3.acsta.net/c_215_290/pictures/17/06/07/15/34/557760.jpg", "title": "BARRY SEAL : AMERICAN TRAFFIC"],
                          ["img": "http://fr.web.img6.acsta.net/c_215_290/pictures/17/07/13/10/58/207157.jpg", "title": "PETIT PAYSAN"],
                          ["img": "http://fr.web.img4.acsta.net/c_215_290/pictures/17/07/20/17/39/592819.jpg", "title": "L'UN DANS L'AUTRE"],
                          ["img": "http://fr.web.img2.acsta.net/c_215_290/pictures/17/07/28/10/01/148014.jpg", "title": "GAUGUIN - VOYAGE DE TAHITI"],
                          ["img": "http://fr.web.img6.acsta.net/c_215_290/pictures/17/07/17/12/49/199993.jpg", "title": "LES GRANDS ESPRITS"],
                          ["img": "http://fr.web.img2.acsta.net/c_215_290/pictures/17/06/20/17/08/123241.jpg", "title": "BIGFOOT JUNIOR"],
                          ["img": "http://fr.web.img5.acsta.net/c_215_290/pictures/17/09/08/09/41/2636970.jpg", "title": "MOTHER!"],
                          ["img": "http://fr.web.img3.acsta.net/c_215_290/pictures/17/07/28/15/56/266725.jpg", "title": "UN BEAU SOLEIL INTÉRIEUR"],
                          ["img": "http://fr.web.img2.acsta.net/c_215_290/pictures/17/08/02/16/51/407072.jpg", "title": "AMERICAN ASSASSIN"],
                          ["img": "http://fr.web.img6.acsta.net/c_215_290/pictures/17/07/28/10/00/052385.jpg", "title": "LE REDOUTABLE"]]
    @IBOutlet weak var tableView: UITableView!

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        self.tableView.rowHeight = 100.0
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
}

extension ViewController: UITableViewDataSource, UITableViewDelegate {
    
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return content.count
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell: FilmCell = tableView.dequeueReusableCell(withIdentifier: "FilmCell", for: indexPath) as! FilmCell
        cell.update(img: content[indexPath.row]["img"]!, title: content[indexPath.row]["title"]!)
        return cell
    }
}
